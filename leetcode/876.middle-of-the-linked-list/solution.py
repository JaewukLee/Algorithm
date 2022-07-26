# 포기

# arr = [head] -> 'head'만 넣었으므로 현재 길이는 1
class Solution:
    def middleNode(self, head: ListNode) -> ListNode:
        arr = [head]
        while arr[-1].next:
            arr.append(arr[-1].next)
        return arr[len(arr) // 2]

# 2개씩 이동하는 것과 1개씩 이동하는 코드를 매번 동시 실행
class Solution:
    def middleNode(self, head):
        slow = fast = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
        return slow