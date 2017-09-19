public class TestDocument {
        public static void main(String[] args) {
                StyleFactory elegantFact = new ElegantStyleFactory();
                
                Document let = elegantFact.createDocument("Letter");
                
                let.open();
                elegantFact.process(let);
        }
}
