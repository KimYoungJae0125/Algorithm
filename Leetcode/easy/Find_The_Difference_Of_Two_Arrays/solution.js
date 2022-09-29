const findDifference = (nums1, nums2) =>
 [Array.from(new Set(nums1)).filter(v => nums2.indexOf(v) === -1 )
    , Array.from(new Set(nums2)).filter(v => nums1.indexOf(v) === -1 )];
console.log (findDifference([1,2,3],[2,4,6]))
console.log (findDifference([1,2,3,3],[1,1,2,2]))