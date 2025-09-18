classDiagram
  %% ===== Main =====
  class Main {
    +main(String[] args) void
  }

  %% ===== Report product =====
  class Report {
    -String title
    -String content
    +Report(String, String)
    +getTitle() String
    +getContent() String
    +toString() String
  }

  interface IReportBuilder {
    +setTitle(String) IReportBuilder
    +setContent(String) IReportBuilder
    +build() Report
  }

  class ConcreteReportBuilder {
    -String title
    -String content
    +setTitle(String) IReportBuilder
    +setContent(String) IReportBuilder
    +build() Report
  }

  %% ===== Car product =====
  class Car {
    -String bodyType
    -String engine
    -String trim
    +Car(String, String, String)
    +getBodyType() String
    +getEngine() String
    +getTrim() String
    +toString() String
  }

  interface ICarBuilder {
    +setBodyType(String) ICarBuilder
    +setEngine(String) ICarBuilder
    +setTrim(String) ICarBuilder
    +build() Car
  }

  class ConcreteCarBuilder {
    -String bodyType
    -String engine
    -String trim
    +setBodyType(String) ICarBuilder
    +setEngine(String) ICarBuilder
    +setTrim(String) ICarBuilder
    +build() Car
  }

  %% ===== Relationships =====
  IReportBuilder <|.. ConcreteReportBuilder
  ICarBuilder    <|.. ConcreteCarBuilder

  ConcreteReportBuilder --> Report : builds
  ConcreteCarBuilder   --> Car    : builds

  Main ..> IReportBuilder : uses
  Main ..> ICarBuilder    : uses
  Main ..> Report : prints
  Main ..> Car    : prints
