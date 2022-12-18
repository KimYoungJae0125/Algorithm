class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]: 
        for i, vI in enumerate(nums):
            for j, vJ in enumerate(nums):
                if i == j: continue
                if vI+vJ == target: return [i,j]
        