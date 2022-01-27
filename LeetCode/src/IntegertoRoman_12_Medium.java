public class IntegertoRoman_12_Medium {
    //https://leetcode.com/problems/integer-to-roman/ ->Problem
    public static String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        int[] arrNumber = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] arrRoman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < arrNumber.length; ) {
            if (num >= arrNumber[i]) {
                result.append(arrRoman[i]);
                num -= arrNumber[i];
            } else {
                i++;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(9));

    }
}
/*Farklı bir çözüm
HashMap<Integer, Character> hashMap = new HashMap<>();
        hashMap.put(1, 'I');
        hashMap.put(5, 'V');
        hashMap.put(10, 'X');
        hashMap.put(50, 'L');
        hashMap.put(100, 'C');
        hashMap.put(500, 'D');
        hashMap.put(1000, 'M');
        int x = num;
        int kacBasamak = 0;
        int basamak = 0;
        String result = "", resultBirler = "", resultOnlar = "", resultYuzler = "", resultBinler = "";
        while (x != 0) {
            x /= 10;
            kacBasamak++;
        }
        int kacBasamakReverse = 1;
        int sayi = 0;
        while (kacBasamak + 1 != kacBasamakReverse) {
            basamak = (int) (num % (Math.pow(10, kacBasamakReverse)));
            num -= basamak;
            if (basamak == 0) {
                kacBasamakReverse++;
                continue;
            } else {
                if (kacBasamakReverse == 1) {
                    if (basamak >= 5) {
                        if (basamak > 8) {
                            sayi = 10 - basamak;
                            result = String.valueOf(hashMap.get(10));
                            while (sayi != 0) {
                                resultBirler += String.valueOf(hashMap.get(1));
                                sayi--;
                            }
                            resultBirler = resultBirler + result;
                        } else {
                            sayi = basamak - 5;
                            result = String.valueOf(hashMap.get(5));
                            while (sayi != 0) {
                                resultBirler += String.valueOf(hashMap.get(1));
                                sayi--;
                            }
                            resultBirler = result + resultBirler;
                        }
                    } else {
                        if (basamak > 3) {
                            sayi = 5 - basamak;
                            result = String.valueOf(hashMap.get(5));
                            //result="";
                            while (sayi != 0) {
                                resultBirler += String.valueOf(hashMap.get(1));
                                sayi--;
                            }
                            resultBirler = resultBirler + result;
                        } else {
                            while (basamak != 0) {
                                resultBirler += String.valueOf(hashMap.get(1));
                                basamak--;
                            }
                            resultBirler = result + resultBirler;
                        }
                    }
                    result = "";
                }
                if (kacBasamakReverse == 2) {
                    if (basamak >= 50) {
                        if (basamak > 80) {
                            sayi = 100 - basamak;
                            result = String.valueOf(hashMap.get(100));
                            while (sayi != 0) {
                                resultOnlar += String.valueOf(hashMap.get(10));
                                sayi -= 10;
                            }
                            resultOnlar = resultOnlar + result;
                        } else {
                            sayi = basamak - 50;
                            result = String.valueOf(hashMap.get(50));
                            while (sayi != 0) {
                                resultOnlar += String.valueOf(hashMap.get(10));
                                sayi -= 10;
                            }
                            resultOnlar = result + resultOnlar;
                        }
                    } else {
                        if (basamak > 30) {
                            sayi = 50 - basamak;
                            result = String.valueOf(hashMap.get(50));
                            while (sayi != 0) {
                                resultOnlar += String.valueOf(hashMap.get(10));
                                sayi -= 10;
                            }
                            resultOnlar = resultOnlar + result;
                        } else {
                            while (basamak != 0) {
                                resultOnlar += String.valueOf(hashMap.get(10));
                                basamak -= 10;
                            }
                            resultOnlar = result + resultOnlar;
                        }
                    }
                    result = "";
                }
                if (kacBasamakReverse == 3) {
                    if (basamak >= 500) {
                        if (basamak > 800) {
                            sayi = 1000 - basamak;
                            result = String.valueOf(hashMap.get(1000));
                            while (sayi != 0) {
                                resultYuzler += String.valueOf(hashMap.get(100));
                                sayi -= 100;
                            }
                            resultYuzler = resultYuzler + result;
                        } else {
                            sayi = basamak - 500;
                            result = String.valueOf(hashMap.get(500));
                            while (sayi != 0) {
                                resultYuzler += String.valueOf(hashMap.get(100));
                                sayi -= 100;
                            }
                            resultYuzler = result + resultYuzler;
                        }
                    } else {
                        if (basamak > 300) {
                            sayi = 500 - basamak;
                            result = String.valueOf(hashMap.get(500));
                            while (sayi != 0) {
                                resultYuzler += String.valueOf(hashMap.get(100));
                                sayi -= 100;
                            }
                            resultYuzler = resultYuzler + result;
                        } else {
                            while (basamak != 0) {
                                resultYuzler += String.valueOf(hashMap.get(100));
                                basamak -= 100;
                            }
                            resultYuzler = result + resultYuzler;
                        }
                    }
                    result = "";
                }
                if (kacBasamakReverse == 4) {
                    while (basamak != 0) {
                        resultBinler += String.valueOf(hashMap.get(1000));
                        basamak -= 1000;
                    }
                    result = "";
                }
            }
        }
        kacBasamakReverse++;
        result = resultBinler + resultYuzler + resultOnlar + resultBirler;
        // System.out.println(resultBinler +" "+ resultYuzler +" "+ resultOnlar +" "+ resultBirler);
        return result;
 */
