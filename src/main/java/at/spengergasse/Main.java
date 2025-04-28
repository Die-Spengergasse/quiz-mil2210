package at.spengergasse;

import at.spengergasse.entities.Answer;
import at.spengergasse.entities.Question;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        EntityManager em = Persistence.createEntityManagerFactory("demo")
//                .createEntityManager();
//
//        TypedQuery<Question> query = em.createQuery("select q from Question q", Question.class);
//        List<Question> questions = query.getResultList();
//
//        for (Question q : questions) {
//            System.out.println(q);
//        }
//
//        TypedQuery<Answer> querys = em.createQuery("select a from Answer a", Answer.class);
//        List<Answer> answers = querys.getResultList();
//
//        for (Answer a : answers) {
//            System.out.println(a);
//        }
//
//        em.close();


        // aus csv lesen und liste erstellen
        //Liste von Objekten aus csv mit scanner erstellen
        //direkt Liste aus csv lesen
        //in csv schreiben
        //Entity klasse
        //Liste in csv speichern
        //Liste aus csv laden
        //min max avg


        // aus csv lesen und liste erstellen
//        public class CSVReaderWithScanner {
//            public static List<String[]> readCSV(String filename) {
//                List<String[]> data = new ArrayList<>();
//                try (Scanner sanner = new Scanner(new File(filename))) {
//                    while (scanner.hasNextLine()) {
//                        String line = scanner.nextLine();
//                        String[] values = line.split(",");
//                        data.add(values);
//                    }
//                } catch (FileNotFoundException e) {
//                    e.printStackTrace();
//                }
//                return data;
//            }
//        }

        //Liste von Objekten aus csv mit scanner erstellen
//        public class Person {
//            private String name;
//            private int alter;
//
//            public Person(String name, int alter) {
//                this.name = name;
//                this.alter = alter;
//            }
//
//            public String getName() { return name; }
//            public int getAlter() { return alter; }
//
//            public String[] toCSV() {
//                return new String[]{name, String.valueOf(alter)};
//            }
//
//            public static Person fromCSV(String[] csv) {
//                return new Person(csv[0], Integer.parseInt(csv[1]));}
//        }

        //direkt Liste aus csv lesen
//        public class PersonCSVLoader {
//            public static List<Person> loadPersons(String filename) {
//                List<Person> personen = new ArrayList<>();
//                try (Scanner sanner = new Scanner(new File(filename))) {
//                    while (scanner.hasNextLine()) {
//                        String line = scanner.nextLine();
//                        String[] parts = line.split(",");
//                        Person p = Person.fromCSV(parts);
//                        personen.add(p);
//                    }
//                } catch (FileNotFoundException e) {
//                    e.printStackTrace();
//                }
//                return personen;
//            }
//        }

        //in csv schreiben
//        public class CSVWriter {
//            public static void writeCSV(String filePath, List<String[]> data) {
//                try (FileWriter writer = new FileWriter(filePath)) {
//                    for (String[] row : data) {
//                        writer.append(String.join(",", row));
//                        writer.append("\n");
//                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }

        //Entity klasse
//        public class Person {
//            private String name;
//            private int alter;
//
//            public Person(String name, int alter) {
//                this.name = name;
//                this.alter = alter;
//            }
//
//            public String getName() {
//                return name;
//            }
//
//            public int getAlter() {
//                return alter;
//            }
//
//            public String[] toCSV() {
//                return new String[]{name, String.valueOf(alter)};
//            }
//
//            public static Person fromCSV(String[] csvRow) {
//                return new Person(csvRow[0], Integer.parseInt(csvRow[1]));
//            }
//
//            @Override
//            public String toString() {
//                return name + " (" + alter+")";
//            }
//        }


        //Liste in csv speichern
//        public class SavePersons {
//            public static void save(List<Person> personen, String filePath) {
//                List<String[]> data = new ArrayList<>();
//                for (Person p : personen) {
//                    data.add(p.toCSV());
//                }
//                CSVWriter.writeCSV(filePath,data);
//            }
//        }

        //Liste aus csv laden
//        public class LoadPersons {
//            public static List<Person> load(String filePath) {
//                List<String[]> raw = CSVReaderWithScanner.readCSV(filePath);
//                List<Person> personen = new ArrayList<>();
//                for (String[] zeile : raw) {
//                    personen.add(Person.fromCSV(zeile));
//                }
//                return personen;
//            }
//        }

        //min max avg
//        public class StatistikAlt {
//
//            public static double durchschnitt(List<Person> personen) {
//                if (personen.isEmpty()) return 0;
//
//                int summe = 0;
//                for (Person p : personen) {
//                    summe += p.getAlter();
//                }
//
//                return (double) summe / personen.size();
//            }
//
//            public static int min(List<Person> personen) {
//                if (personen.isEmpty()) return 0;
//
//                int min = personen.get(0).getAlter();
//                for (Person p : personen) {
//                    if (p.getAlter() < min) {
//                        min = p.getAlter();
//                    }
//                }
//                return min;
//            }
//        public static int max(List<Person> personen) {
//            if (personen.isEmpty()) return 0;
//
//            int max = personen.get(0).getAlter();
//            for (Person p : personen) {
//                if (p.getAlter() > max) {
//                    max = p.getAlter();
//                }
//            }
//            return max;
//        }
//    }



        }
}
