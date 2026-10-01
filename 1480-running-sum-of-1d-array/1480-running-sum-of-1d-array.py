class Solution(object):
    def runningSum(self, nums):
        ps = [0] * len(nums)   # initialize list with zeros
        ps[0] = nums[0]        # first element same as nums[0]
        for i in range(1, len(nums)):
            ps[i] = nums[i] + ps[i - 1]
        return ps

        