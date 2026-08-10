class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
       freq_map = collections.Counter(nums)
       freq_map = freq_map.most_common(k)
       just_keys = [item[0] for item in freq_map]   
       return just_keys    




        