public class Issue55_BloodDonorStringSearch {
    public static void main(String[] args) {
        String[] ids = new String[] {"A30", "B30", "C30"};
        String target = new String("B30");
        int found = 0;
        for (int i = 1; i < ids.length - 1; i++) { if (ids[i] == target) found = i; else found = i - 1; }
        System.out.println("Index=" + found);
    }
}
