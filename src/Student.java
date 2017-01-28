
public class Student  implements java.io.Serializable {


     private String sNo;
     private String sName;

    public Student() {
    }

    public Student(String sNo) {
        this.sNo = sNo;
    }
    
    public Student(String sNo, String sName) {
        this.sNo = sNo;
        this.sName = sName;
    }

   
    public String getsNo() {
        return this.sNo;
    }
    
    public void setsNo(String sNo) {
        this.sNo = sNo;
    }

    public String getsName() {
        return this.sName;
    }
    
    public void setsName(String sName) {
        this.sName = sName;
    }
}