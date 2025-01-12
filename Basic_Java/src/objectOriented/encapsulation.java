package objectOriented;


class TCS{
    private int _emp_id;
    private String _prev_company;
    void setData(int _id, String p_c) {
        this._emp_id = _id;
        this._prev_company = p_c;
    }
    void getData(){
        System.out.println(_emp_id);
        System.out.println(_prev_company);
    }
}
public class encapsulation {
    public static void main(String[] args) { TCS tcs = new TCS();
        tcs.setData(2123, "Red Fibre");
        tcs.getData();
    }
}
