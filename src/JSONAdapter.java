class JSONAdapter implements JSONDataProcessor {
    private XMLDataProcessor xmlProcessor;

    public JSONAdapter(XMLDataProcessor processor) {

        this.xmlProcessor = processor;
    }

    @Override
    public void processJSON(String jsonData) {
       // jsonData = "mikkel";
        // Konvertering fra JSON til XML (simpel simulering)
        String xmlData = "<data>" + jsonData + "</data>";
        xmlProcessor.processXML(xmlData);
    }
}