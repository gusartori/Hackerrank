import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Gustavo on 12/08/17.
 */
public class BookingTest {

    public static void main(String[] args) {
        primeJoyAnagram();

    }


    private static void poligons() {
//        List<int[]> pols = Arrays.asList(new int[]{-1, 1}, new int[]{2, -1});
        int[] p1 = new int[]{-1,1};
        int[] p2 = new int[]{2,-1};
        int xAxis = Math.max(p2[0] , p1[0]) - Math.min(p2[0] , p1[0]);
        int yAxis = Math.max(p2[1] , p1[1]) - Math.min(p2[1] , p1[1]);

        if(xAxis==yAxis){
            System.out.println("SQUARE");
        } else {
            System.out.println("RECTANGLE");
        }

    }

    private static void poligonsFourPoints() {
        int[] p1 = new int[]{-1,2};
        int[] p2 = new int[]{-1,-1};
        int[] p3 = new int[]{1,-1};
        int[] p4 = new int[]{1,2};
        List<int[]> points = Arrays.asList(p1,p2,p3,p4);
        int xEqualCounter = 0;
        int yEqualCounter = 0;
        for (int i = 0; i < points.size(); i++) {
            for (int j = i + 1; j < points.size(); j++) {
                if(points.get(i)[0]==points.get(j)[0]){
                    xEqualCounter++;
                }
                if(points.get(i)[1]==points.get(j)[1]){
                    yEqualCounter++;
                }
            }
        }
        if(xEqualCounter!=2||yEqualCounter!=2){
            System.out.println("POLYGON");
        } else {
            int minX = p1[0];
            int maxX = p1[0];
            int minY = p1[1];
            int maxY = p1[1];
            for (int i = 0; i < points.size(); i++) {
                if (points.get(i)[0] < minX) {
                    minX = points.get(i)[0];
                }
                if (points.get(i)[0] > maxX) {
                    maxX = points.get(i)[0];
                }
                if (points.get(i)[1] < minY) {
                    minY = points.get(i)[1];
                }
                if (points.get(i)[0] > maxY) {
                    maxY = points.get(i)[1];
                }
            }
            int xAxis = Math.max(maxX, minX) - Math.min(maxX, minX);
            int yAxis = Math.max(maxY, minY) - Math.min(maxY, minY);

            if (xAxis == yAxis) {
                System.out.println("SQUARE");
            } else {
                System.out.println("RECTANGLE");
            }
        }
    }

    private static void timeStamp(){

        List<int[]> ints = Arrays.asList(new int[]{100, 200}, new int[]{100, 2000},new int[]{1400, 2000}, new int[]{1200, 1800}, new int[]{1600, 2400});
        ints.sort((o1, o2) -> {
            if(o1[0]>=o2[0]){
                return 1;
            }else return -1;
        });
        int overlap = 0;
        for (int i = 0; i < ints.size(); i++) {
            for (int j = i+1; j < ints.size(); j++) {
                if(ints.get(i)[0]>=ints.get(j)[0]||(ints.get(i)[1]>=ints.get(j)[0]&&ints.get(i)[1]<=ints.get(j)[1])){
                    overlap++;
                }
            }
        }
        System.out.println(overlap);
        String a ;

        ints.forEach(ints1 -> System.out.println(ints1[0]));

    }

    private static void intStreamExample(){
        int l= 3;
        int k= 10;
        List<Integer> collect = IntStream.range(l, k+1).filter(value -> value % 2 != 0).boxed().collect(Collectors.toList());
        collect.forEach(integer -> System.out.println(integer));
        collect.toArray();
    }

    private static void anyMatchExample(){
        int[] arr = new int[]{100, 200};
        Arrays.stream(arr).anyMatch(value -> value==100);
    }

    private static void reviewsHotel(){
        List<String> words = Arrays.asList("caro", "bonito", "sujo", "barato", "aconchegante");
        Map<String,String> hotels = new HashMap();
        hotels.put("rits","um hotel muito bonito e aconchegante");
        hotels.put("masterblaster","um hotel muito caro, sujo, barato, barato, bonito e aconchegante");
        hotels.put("super8","um hotel muito caro, barato, bonito e aconchegante");
        hotels.put("ramada","um hotel muito barato, bonito e aconchegante");

        Map<String,Integer> result = new HashMap();
        hotels.forEach((h,r)->{
            words.forEach(w->{
                if(r.toLowerCase().contains(w.toLowerCase())){
                    if(result.get(h)!=null)
                    {
                        result.put(h,result.get(h)+1);
                    } else {
                        result.put(h,1);
                    }
                }
            });
        });
//        result.forEach((k,v)->System.out.println(k+" - "+v));
        Comparator<Map.Entry<String, Integer>> entryComparator = (n1, n2) -> {
            if (n1.getValue() == 4) {
                return 1;
            }
            if (n2.getValue() == 4) {
                return -1;
            }
            if (n1.getValue() - n2.getValue() >= 0) {
                return 1;
            } else {
                return -1;
            }
        };
        result.entrySet().stream().sorted(entryComparator.reversed()).forEachOrdered(x->System.out.println(x.getKey()+" - "+x.getValue()));
        result.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .forEachOrdered(x->System.out.println(x.getKey()+" - "+x.getValue()));
    }

    private static void primeJoyAnagram(){
        char[] wordArr = "cachorro".toCharArray();
        Map<Character, Integer> mapCharsPrime = new HashMap<>();
        long p = 1;

        List<Integer> collectPrime = IntStream.rangeClosed(2,1000)
                .filter(i -> IntStream.rangeClosed(2, (int) Math.sqrt(i)).allMatch(j -> i % j != 0))
                .boxed()
                .collect(Collectors.toList());
        for (int i = 0; i < wordArr.length; i++) {
            if(!mapCharsPrime.containsKey(wordArr[i]))
                mapCharsPrime.put(wordArr[i],collectPrime.get(i));
        }
        for (int i = 0; i < wordArr.length; i++) {
            p *= mapCharsPrime.get(wordArr[i]);
        }
        long p1 =1;
        char[] wordArr1 = "orrohcac".toCharArray();
        for (int i = 0; i < wordArr1.length; i++) {
            p1 *= mapCharsPrime.get(wordArr[i]);
        }
        System.out.println(p+" ---- "+p1);

        IntStream.rangeClosed(2,5).filter(value -> value%2!=0).boxed().collect(Collectors.toList()).toArray();

        int[] a = new int[4];
    }
}


