package tcs.ilp.grabaseat.booking;

/**
 * Created by shyam on 19-Aug-17.
 */

public class BookDetail {
    public String name, empid, lg;

    public BookDetail() {

    }

    public BookDetail(String name, String empid, String lg) {
        this.name = name;
        this.empid = empid;
        this.lg = lg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getLg() {
        return lg;
    }

    public void setLg(String lg) {
        this.lg = lg;
    }
}
