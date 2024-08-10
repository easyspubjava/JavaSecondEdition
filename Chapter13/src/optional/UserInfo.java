package optional;

public class UserInfo {
    private int id;
    private String name;

    public UserInfo(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
