package uz.exemple.less53_telegramui_notifications_java.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.switchmaterial.SwitchMaterial;

import java.util.ArrayList;
import java.util.List;

import uz.exemple.less53_telegramui_notifications_java.R;
import uz.exemple.less53_telegramui_notifications_java.model.ItemModel;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private ArrayList<ItemModel> itemList;

    public ItemAdapter(ArrayList<ItemModel> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_child,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ItemModel item = itemList.get(position);
        if (item.getIcon()!=null){
            holder.iv_childIcon.setImageResource(item.getIcon());
            holder.switch1.setVisibility(View.GONE);
            holder.iv_childRight.setVisibility(View.VISIBLE);
        }else {
            holder.iv_childIcon.setVisibility(View.GONE);
            holder.tv_onOff.setVisibility(View.GONE);
        }

        holder.tv_childTitle.setText(item.getTitle());
        if (item.getBtnOnOff()==true){
            holder.tv_onOff.setText("On");
            holder.switch1.setChecked(true);
        }else{
            holder.tv_onOff.setText("Off");
            holder.switch1.setChecked(false);
        }
        if (item.getDesc()!=null){
            holder.tv_childDesc.setText(item.getDesc());
            holder.tv_childDesc.setVisibility(View.VISIBLE);
        }


    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iv_childIcon;
        ImageView iv_childRight;
        TextView tv_childTitle;
        TextView tv_onOff;
        TextView tv_childDesc;
        SwitchMaterial switch1;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_childIcon = itemView.findViewById(R.id.iv_childIcon);
            iv_childRight = itemView.findViewById(R.id.iv_childRight);
            tv_childTitle = itemView.findViewById(R.id.tv_childTitle);
            tv_onOff = itemView.findViewById(R.id.tv_onOff);
            tv_childDesc = itemView.findViewById(R.id.tv_childDesc);
            switch1 = itemView.findViewById(R.id.switch1);
        }
    }
}
