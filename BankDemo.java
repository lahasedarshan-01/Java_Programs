interface Bank {
    float getInterestRate();
}

class SBI implements Bank {
    public float getInterestRate() {
        return 6.5f;
    }
}

class HDFC implements Bank {
    public float getInterestRate() {
        return 7.0f;
    }
}

class ICICI implements Bank {
    public float getInterestRate() {
        return 7.5f;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println("SBI Rate: " + b.getInterestRate());

        b = new HDFC();
        System.out.println("HDFC Rate: " + b.getInterestRate());

        b = new ICICI();
        System.out.println("ICICI Rate: " + b.getInterestRate());
    }
}