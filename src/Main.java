public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        XMLDataProcessor xmlProcessor = new XMLDataProcessor();
        JSONAdapter adapter = new JSONAdapter(xmlProcessor);
        adapter.processJSON("{\"data\": \"value\"}");

    }
}