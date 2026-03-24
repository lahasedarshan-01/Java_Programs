class EmployeeNetPay {
    int empno;
    String ename;
    float basic, hra, da, netpay;

    float Calculate() {
        return basic + hra + da;
    }

    void havedata() {
        empno = 1;
        ename = "Amit";
        basic = 10000;
        hra = 2000;
        da = 1500;
        netpay = Calculate();
    }

    void dispdata() {
        System.out.println(empno + " " + ename + " " + netpay);
    }

    public static void main(String[] args) {
        EmployeeNetPay e = new EmployeeNetPay();
        e.havedata();
        e.dispdata();
    }
}