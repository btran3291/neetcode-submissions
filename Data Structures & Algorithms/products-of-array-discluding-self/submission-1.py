class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        p = 0
        results = [1] * len(nums)
        prefix = [1] * len(nums)
        for i in range (1,len(nums)):
            prefix[i] = prefix[i-1] * nums[i-1]
        suffix = [1] * len(nums)
        for i in range(len(nums)-2, -1, -1):
            suffix[i] = suffix[i + 1] * nums[i + 1]
        for i in range (0,len(nums)):
            results[i] = prefix[p] * suffix[p]
            p = p+1
        return results




