class MyLinkedList:

    def __init__(self):
        self.head = None
        self.next = None
        self.tail = None
        self.val = 0
        
    def getNodeAtIndex(self, index: int):
        bot = MyLinkedList()
        bot = self.head
        idx = 0
        while (idx < index):
            bot = bot.next
            idx += 1
            
        return bot

    def get(self, index: int) -> int:
        if index < 0:
            return -1
        
        if index >= self.val:
            return -1
        
        return self.getNodeAtIndex(index).val

    def addAtHead(self, val: int) -> None:
        node = MyLinkedList()
        node.val = val
        
        if self.head is None:
            self.head = node
            self.tail = node
            self.val = 1
            return
        
        self.head.prev = node
        node.next = self.head
        self.head = node
        self.val += 1

    def addAtTail(self, val: int) -> None:
        if self.tail is None:
            self.addAtHead(val)
            return
        
        node = MyLinkedList()
        node.val = val
        self.tail.next = node
        node.prev = self.tail
        self.tail = node
        self.val += 1

    def addAtIndex(self, index: int, val: int) -> None:
        if index < 0:
            return
        
        if index > self.val:
            return
        
        if index == 0:
            self.addAtHead(val)
            return
            
        if index == self.val:
            self.addAtTail(val)
            return
        
        node = self.getNodeAtIndex(index)
        newNode = MyLinkedList()
        newNode.val = val
        
        newNode.prev = node.prev
        newNode.prev.next = newNode
        node.prev = newNode
        newNode.next = node
        self.val += 1

    def deleteAtIndex(self, index: int) -> None:
        if index < 0:
            return True
        
        if index >= self.val:
            return True
        
        self.val -= 1
                
        if index == 0:
            self.head = self.head.next
            return
        
        if index == self.val:
            self.tail = self.tail.prev
            return
            
        bot = self.getNodeAtIndex(index)
        bot.prev.next = bot.next
        bot.next.prev = bot.prev