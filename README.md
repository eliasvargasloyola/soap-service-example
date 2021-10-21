# Spring Boot Soap Service Example

In this project you can find a complete configuration to expose a SOAP service with SpringBoot.

Project based on Spring Documentation [HERE](https://spring.io/guides/gs/producing-web-service/)

### Versions

- Java 1.8
- Gradle 6.9
- SpringBoot 2.5.4

### Commands to init:

1. `./gradlew clean build`
2. `./gradlew bootRun`

The service will be exposed in this link

- http://localhost:9091/ws/inspeccion.wsdl

### Request example

```xml

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:gs="http://spring.io/guides/gs-producing-web-service">
    <soapenv:Header/>
    <soapenv:Body>
        <gs:crearSolicitudInspeccionRequest>
            <gs:parametro><![CDATA[<root>value</root>]]></gs:parametro>
        </gs:crearSolicitudInspeccionRequest>
    </soapenv:Body>
</soapenv:Envelope>
```

### Response example

```xml

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:gs="http://spring.io/guides/gs-producing-web-service">
    <soapenv:Header/>
    <soapenv:Body>
        <gs:crearSolicitudInspeccionRequest>
            <gs:parametro><![CDATA[<response>Hi All</response>]]></gs:parametro>
        </gs:crearSolicitudInspeccionRequest>
    </soapenv:Body>
</soapenv:Envelope>
```
