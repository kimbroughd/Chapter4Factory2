public class TestDocument {
        public static void main(String[] args) {
                StyleFactory fancyFact = new FancyStyleFactory();
                
                Document let = fancyFact.createDocument("Letter");
                
                let.open();
                fancyFact.process(let);
        }
}
