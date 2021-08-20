package com.company;

import java.util.HashMap;
import java.util.Map;

public class BorrowCardManagementUsingMap {
    private Map<String, BorrowCard> borrowCardMap = new HashMap<>();

    public Map<String, BorrowCard> getBorrowCardMap() {
        return borrowCardMap;
    }

    public void setBorrowCardMap(Map<String, BorrowCard> borrowCardMap) {
        this.borrowCardMap = borrowCardMap;
    }

    public void showAll() {
        for (Map.Entry<String, BorrowCard> borrowCardEntry : borrowCardMap.entrySet()) {
            System.out.println(borrowCardEntry.getValue());
        }
    }

    public void addNewBorrowCard(BorrowCard borrowCard) {
        this.borrowCardMap.put(borrowCard.getId(), borrowCard);
    }

    public void updateBorrowCard(String id, BorrowCard borrowCard) {
        this.borrowCardMap.replace(id, borrowCard);
    }

    public void removeBorrowCard(String id) {
        this.borrowCardMap.remove(id);
    }

    public BorrowCard getBorrowCard(String id) {
        return this.borrowCardMap.get(id);
    }

    public boolean findBorrowCardById(String id) {
        return borrowCardMap.containsKey(id);
    }
}
