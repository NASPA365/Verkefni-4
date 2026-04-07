# Ferðaplan - JavaFX verkefni 4

Forrit til að skrá ferðir og ferðaplön með TableView, síu, dagsetningum, athugasemdum og kostnaði.

## Bygging og keyrsla

### 1. Klónaðu repository
```bash
git clone https://github.com/NASPA365/Verkefni-4
cd Verkefni-4
```

### 2. Byggðu verkefnið
```bash
mvn clean compile
```

### 3. Keyrðu forritið
```bash
mvn javafx:run
```

**Eða í einu skrefi:**
```bash
mvn clean javafx:run
```

### 4. Búa til JAR skrá (valfrjálst)
```bash
mvn clean package
java -jar target/Verkefni-4-1.0.jar
```

## Kröfur (frá pom.xml)
- **Java 25**
- **Maven 3.11.0+** 
- **JavaFX 25.0.1**
- **MainClass:** `ModuleNafn/is.vidmot.FerdaplanApp`

## Helstu eiginleikar
- TableView með síu og flokkun
- Bæta við/eyða/skoða ferðir
- Tvísmellur til að opna ferð
- Dagsetning frá og til
- Athugasemdir og kostnaður

## Útgáfur
- **v1.0** - Tilbúin til notendaprófana
- **v2.0** - Lokaverkefni (í vinnslu)

## Höfundur
NASPA365 - Verkefni 4
