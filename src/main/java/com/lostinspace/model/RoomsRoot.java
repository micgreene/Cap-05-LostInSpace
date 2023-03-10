package com.lostinspace.model;

/*
 * Game Map Class| Author: Mike Greene
 * Game map object for text adventure Lost in Space.
 * Holds all data for each room in the game.
 */

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// after loading the text resource for the game map, acts as the root ArrayList for all Rooms
public class RoomsRoot {
    public List<Room> rooms;
    private Map<String, Room> roomMap;

    public void createMap() {
        roomMap = rooms
                .stream()
                .collect(Collectors.toUnmodifiableMap(Room::getName, Function.identity()));
//        for (Room room : rooms) {
//            room.setExitMap(
//                    room.getExits()
//                            .entrySet()
//                            .stream()
//                            .filter(entry -> !entry.getValue().trim().isEmpty())
//                            .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, entry -> roomMap.get(entry.getValue())))
//            );
//        }
    }

    public Map<String, Room> getRoomMap() {
        return roomMap;
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
