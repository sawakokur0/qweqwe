classDiagram
  %% ====== Main ======
  class Main {
    +main(String[] args) void
  }

  %% ====== Report ======
  class Report {
    -String title
    -String content
    +Report(Builder)  %% existing nested builder ctor
    +getTitle() String
    +getContent() String
    +toString() String
  }

  class "Report~Builder~" as ReportBuilder {
    -String title
    -String content
    +setTitle(String) Report~Builder~
    +setContent(String) Report~Builder~
    +build() Report
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

  %% ====== Car ======
  class Car {
    -String bodyType
    -String engine
    -String trim
    +Car(Builder)     %% existing nested builder ctor
    +getBodyType() String
    +getEngine() String
    +getTrim() String
    +toString() String
  }

  class "Car~Builder~" as CarBuilder {
    -String bodyType = "Sedan"
    -String engine = "2.0L Turbo Inline-4"
    -String trim = "Standard"
    +setBodyType(String) Car~Builder~
    +setEngine(String) Car~Builder~
    +setTrim(String) Car~Builder~
    +build() Car
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

  %% ====== Relations ======
  Report o-- ReportBuilder : builds
  Car o-- CarBuilder : builds

  IReportBuilder <|.. ConcreteReportBuilder
  ICarBuilder    <|.. ConcreteCarBuilder

  ConcreteReportBuilder --> Report : builds
  ConcreteCarBuilder --> Car : builds

  Main ..> Report : uses
  Main ..> Car    : uses
  Main ..> IReportBuilder : uses
  Main ..> ICarBuilder    : uses
