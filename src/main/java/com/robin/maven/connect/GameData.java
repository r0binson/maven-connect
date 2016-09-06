/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robin.maven.connect;

import java.util.List;

/**
 *
 * @author robin
 */
public class GameData {

	private boolean gameHasEnded;
	private String playerTurn;
	private int gameId;
	private DisplayColumn[] displayColumns;

	/**
	 * @return the gameHasEnded
	 */
	public boolean isGameHasEnded() {
		return gameHasEnded;
	}

	/**
	 * @param gameHasEnded the gameHasEnded to set
	 */
	public void setGameHasEnded(boolean gameHasEnded) {
		this.gameHasEnded = gameHasEnded;
	}

	/**
	 * @return the playerTurn
	 */
	public String getPlayerTurn() {
		return playerTurn;
	}

	/**
	 * @param playerTurn the playerTurn to set
	 */
	public void setPlayerTurn(String playerTurn) {
		this.playerTurn = playerTurn;
	}

	/**
	 * @return the gameId
	 */
	public int getGameId() {
		return gameId;
	}

	/**
	 * @param gameId the gameId to set
	 */
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	/**
	 * @return the displayColumns
	 */
	public DisplayColumn[] getDisplayColumns() {
		return displayColumns;
	}

	/**
	 * @param displayColumns the displayColumns to set
	 */
	public void setDisplayColumns(DisplayColumn[] displayColumns) {
		this.displayColumns = displayColumns;
	}



}
