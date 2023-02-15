class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] index = {0};
        Set<Integer> arr2Set = new HashSet<>(){{
           for(int arr : arr2) add(arr);
        }};
        List<Integer> remainder = new ArrayList<>(){{
            for(int arr : arr1) if(!arr2Set.contains(arr)) add(arr);
        }};

        int[] result = new int[arr1.length];

        for(int arr : arr2) {
            for(int ar : arr1) {
                if(ar == arr) result[index[0]++] = arr;
            }
        }

        remainder.stream().sorted().forEach(remain -> result[index[0]++] = remain);

        return result;
    }
}