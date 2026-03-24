class Resort {
    int Rno, Days;
    String Name;
    float Charges;

    float Compute() {
        float amount = Days * Charges;
        if (amount > 11000)
            amount = (float)(1.02 * amount);
        return amount;
    }

    void Getinfo() {
        Rno = 101;
        Name = "Raj";
        Charges = 2000;
        Days = 6;
    }

    void DispInfo() {
        System.out.println(Rno + " " + Name + " " + Compute());
    }

    public static void main(String[] args) {
        Resort r = new Resort();
        r.Getinfo();
        r.DispInfo();
    }
}