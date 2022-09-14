package uz.exemple.less53_telegramui_notifications_java.model;

import java.util.ArrayList;
import java.util.List;

public class MainModel {
    private ArrayList<ItemModel> itemList;
    private String itemText;

    public MainModel(ArrayList<ItemModel> itemList, String itemText) {
        this.itemList = itemList;
        this.itemText = itemText;
    }

    public ArrayList<ItemModel> getItemList() {
        return itemList;
    }

    public String getItemText() {
        return itemText;
    }
}
