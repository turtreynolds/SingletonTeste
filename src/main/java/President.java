
public class President
{
    private President() {};

    private static President instance = new President();

    public static President getInstance()
    {
        return instance;
    }

    private String presidentName;
    private boolean onOffice = true;

    public String getPresidentName()
    {
        return presidentName;
    }

    public void setPresidentName(String presidentName)
    {
        this.presidentName = presidentName;
    }
}
