package recordclass;

public record StudentInfo(int id, String name){

    public static String SCHOOL_NAME = "MY_SCHOOL";

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof StudentInfo std) {
            return this.id == std.id;
        }
        else return false;
    }

    public void setName(String name){
       // this.name = name;
    }

    public static void main(String[] args) {

        StudentInfo studentInfo = new StudentInfo(12345, "최치원");
        StudentInfo studentInfo2 = new StudentInfo(12345, "김유신");

        System.out.println(studentInfo.equals(studentInfo2));
        System.out.println(studentInfo.name());
        System.out.println(studentInfo);
    }
}
