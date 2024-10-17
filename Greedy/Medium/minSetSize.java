class Solution {
    public int minSetSize(int[] arr) {
        Arrays.sort(arr);
        List<Integer> counts = new ArrayList<>();
        int currCount = 1;
        for(int i = 1; i< arr.length; i++){
            if(arr[i] == arr[i-1]) {
                currCount +=1;
                continue;
            }
            counts.add(currCount);
            currCount = 1;
        }
        counts.add(currCount);

        Collections.sort(counts);
        Collections.reverse(counts);

        // Remove numbers until at least half are removed.
        int numbersRemovedFromArr = 0;
        int setSize = 0;
        for (int count : counts) {
            numbersRemovedFromArr += count;
            setSize += 1;
            if (numbersRemovedFromArr >= arr.length / 2) {
                break;
            }
        }

        return setSize;

    }
}