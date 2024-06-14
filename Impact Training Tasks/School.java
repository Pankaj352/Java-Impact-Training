public class School {
    private String school_name;
    private String address;
    private String city;
    private long mobile;
    private String mail;
    private int pincode;

    public School(String school_name, String address, String city, long mobile, String mail, int pincode) {
        this.school_name = school_name;
        this.address = address;
        this.city = city;
        this.mobile = mobile;
        this.mail = mail;
        this.pincode = pincode;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

}

class Student {
    private String stud_name;
    private String stud_address;
    private String stud_city;
    private long stud_mobile;

    public Student(String stud_name, String stud_address, String stud_city, long stud_mobile, String stud_mail) {
        this.stud_name = stud_name;
        this.stud_address = stud_address;
        this.stud_city = stud_city;
        this.stud_mobile = stud_mobile;
        this.stud_mail = stud_mail;
    }

    private String stud_mail;

    public String getStud_name() {
        return stud_name;
    }

    public void setStud_name(String stud_name) {
        this.stud_name = stud_name;
    }

    public String getStud_address() {
        return stud_address;
    }

    public void setStud_address(String stud_address) {
        this.stud_address = stud_address;
    }

    public String getStud_city() {
        return stud_city;
    }

    public void setStud_city(String stud_city) {
        this.stud_city = stud_city;
    }

    public long getStud_mobile() {
        return stud_mobile;
    }

    public void setStud_mobile(long stud_mobile) {
        this.stud_mobile = stud_mobile;
    }

    public String getStud_mail() {
        return stud_mail;
    }

    public void setStud_mail(String stud_mail) {
        this.stud_mail = stud_mail;
    }

    public int getStud_pincode() {
        return stud_pincode;
    }

    public void setStud_pincode(int stud_pincode) {
        this.stud_pincode = stud_pincode;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    School school;

    public void displayInfo() {

    }
}

class Test {
    public static void main(String[] args) {

        School school = new School();
        Student st = new Student();
        school.setSchool_name("CMS");
        System.out.println(school.getSchool_name());

        st.setStud_name("Shubham");
        System.out.println(st.getStud_name());

    }
}