package uz.exemple.less53_telegramui_notifications_java.model;

public class ItemModel {
    private Integer icon = null;
    private String title;
    private String desc = null;
    private Boolean btnOnOff = false;



    public ItemModel(Integer icon, String title, String desc, Boolean btnOnOff) {
        this.icon = icon;
        this.title = title;
        this.desc = desc;
        this.btnOnOff = btnOnOff;
    }

    public Integer getIcon() {
        return icon;
    }
    public String getDesc() {
        return desc;
    }
    public String getTitle() {
        return title;
    }

    public Boolean getBtnOnOff() {
        return btnOnOff;
    }

}
