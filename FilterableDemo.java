interface Filterable {
    void apply_filter(String type);
    void reset_filter();
}

class ImageProcessor implements Filterable {
    public void apply_filter(String type) {
        System.out.println("Image filter applied: " + type);
    }

    public void reset_filter() {
        System.out.println("Image filter reset");
    }
}

class DataAnalyzer implements Filterable {
    public void apply_filter(String type) {
        System.out.println("Data filter applied: " + type);
    }

    public void reset_filter() {
        System.out.println("Data filter reset");
    }
}

public class FilterableDemo {
    public static void main(String[] args) {
        ImageProcessor img = new ImageProcessor();
        img.apply_filter("Blur");
        img.reset_filter();

        DataAnalyzer data = new DataAnalyzer();
        data.apply_filter("Noise");
        data.reset_filter();
    }
}