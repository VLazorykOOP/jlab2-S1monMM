public class Account {
    private String surname;
    private int id;
    private int percent;
    private int sum;

    public Account(String surname, int id, int percent, int sum) {
        this.surname = surname;
        this.id = id;
        this.percent = percent;
        this.sum = sum;
    }

    public void changeSurname(String surname) {
        this.surname = surname;
    }
    public void withdrawMoney(int money) {
        this.sum -= money;
    }
    public void putMoney(int money) {
        this.sum += money;
    }
    public void Percentage() {
        double newSum = (this.sum * (this.percent/100.0));
        this.sum += newSum;
    }
    public void numberWriting() {
        int number = this.sum;
        
        String[] одиниці = {"", "одна", "дві", "три", "чотири", "п'ять", "шість", "сім", "вісім", "дев'ять", 
                            "десять", "одинадцять", "дванадцять", "тринадцять", "чотирнадцять", "п'ятнадцять", 
                            "шістнадцять", "сімнадцять", "вісімнадцять", "дев'ятнадцять"};
        String[] десятки = {"", "", "двадцять", "тридцять", "сорок", "п'ятдесят", "шістдесят", 
                            "сімдесят", "вісімдесят", "дев'яносто"};
        String[] сотні = {"", "сто", "двісті", "триста", "чотириста", "п'ятсот", "шістсот", 
                          "сімсот", "вісімсот", "дев'ятсот"};
        String[] тисячі = {"", "тисяча", "тисячі", "тисяч"};
        
        if (number == 0) {
            System.out.println("нуль гривень");
            return;
        }

        StringBuilder result = new StringBuilder();

        if (number >= 1000) {
            int t = number / 1000;
            if (t == 1) {
                result.append("одна тисяча ");
            } else if (t == 2) {
                result.append("дві тисячі ");
            } else if (t < 5) {
                result.append(одиниці[t]).append(" ").append(тисячі[1]).append(" ");
            } else {
                result.append(одиниці[t]).append(" ").append(тисячі[3]).append(" ");
            }
            number %= 1000;
        }

        if (number >= 100) {
            result.append(сотні[number / 100]).append(" ");
            number %= 100;
        }

        if (number >= 20) {
            result.append(десятки[number / 10]).append(" ");
            number %= 10;
        }

        if (number > 0) {
            result.append(одиниці[number]).append(" ");
        }

        result.append("гривень");
        
        System.out.println("Surname: " + this.surname);
        System.out.println("ID: " + this.id);
        System.out.println("Sum: " + this.sum + " UAH");
        System.out.println(result.toString().trim());
    }
}
