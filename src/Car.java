public class Car {
    private final String bodyType;
    private final String engine;
    private final String trim;

    private Car(Builder builder) {
        this.bodyType = builder.bodyType;
        this.engine = builder.engine;
        this.trim = builder.trim;
    }

    public String getBodyType() { return bodyType; }
    public String getEngine() { return engine; }
    public String getTrim() { return trim; }

    @Override
    public String toString() {
        return "Car{" +
                "bodyType='" + bodyType + '\'' +
                ", engine='" + engine + '\'' +
                ", trim='" + trim + '\'' +
                '}';
    }

    public static class Builder {
        private String bodyType = "Sedan";
        private String engine = "2.0L Turbo Inline-4";
        private String trim = "Standard";

        public Builder setBodyType(String bodyType) {
            this.bodyType = bodyType;
            return this;
        }

        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setTrim(String trim) {
            this.trim = trim;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
