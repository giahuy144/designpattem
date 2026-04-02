package main.java.com.giahuy.designpattem.Structural_pattern_ex6.ProxyPattern.service;

import main.java.com.giahuy.designpattem.Structural_pattern_ex6.ProxyPattern.model.Item;

import java.util.List;

public interface Inventory {
    List<Item> getItems();
}