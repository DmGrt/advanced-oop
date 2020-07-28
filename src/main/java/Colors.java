public enum Colors {
    Red("червоний"),
    Orange("помаранчевий"),
    Yellow("жовтий"),
    Green("зелений"),
    Blue("синій"),
    Purple("фіолетовий"),
    Black("чорний");

    private final String color;

    Colors(String color){
        this.color = color;
    }

    public String getValue(){
        return color;
    }
}
