public abstract class Document {
        String type;
        String style;
        
        public Document(String documentType) {
                type = documentType;
        }
        public void setStyle(String style) {
              this.style = style;
        }
        public void process() {
                System.out.println(style + type + " '" + name + "' processed.")
        }
 }
