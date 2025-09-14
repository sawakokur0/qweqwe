public class Report {
    private final String title;
    private final String content;

    private Report(Builder builder) {
        this.title = builder.title;
        this.content = builder.content;
    }

    public String getTitle() { return title; }
    public String getContent() { return content; }

    @Override
    public String toString() {
        return "Report{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public static class Builder {
        private String title;
        private String content;

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Report build() {
            return new Report(this);
        }
    }
}
