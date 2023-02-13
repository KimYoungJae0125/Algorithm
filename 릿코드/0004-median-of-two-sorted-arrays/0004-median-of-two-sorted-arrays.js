/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
const findMedianSortedArrays = (nums1, nums2)  => 
[...nums1, ...nums2]
.sort((a,b) => a-b)
.splice(Math.ceil((nums1.length+nums2.length)/2)-1, (nums1.length+nums2.length) % 2 == 0 ? 2 : 1)
.reduce((x, y) => (x+y)/2).toFixed(5);