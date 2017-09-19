public abstract class Document {
        String name;
        String type;
        
        public Document(String documentName) {
                name = documentName;
        }
        public void setType(String type) {
              this.type = type;
        }
        public void change() {
                System.out.println("Document " + name + " changed.")
 }
