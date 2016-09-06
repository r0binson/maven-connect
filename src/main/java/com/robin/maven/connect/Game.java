/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robin.maven.connect;

import java.util.Map;

/**
 *
 * @author robin
 */
public class Game {
	private int gameId;
	private String player1;
	private String player2;
	private boolean full;
	private String winner;
	
	private int chipsDropped;
	private String playerTurn ;
	private boolean gameHasEnded;
	private Map [] displayColumns;
	private String [][] columns;
	

	
	public Game(int gameId, String creator){
		this.gameId = gameId;
		this.player1 = creator;
	}
	
	public Game (){
		
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
	 * @return the player1
	 */
	public String getPlayer1() {
		return player1;
	}

	/**
	 * @param player1 the player1 to set
	 */
	public void setPlayer1(String player1) {
		this.player1 = player1;
	}

	/**
	 * @return the player2
	 */
	public String getPlayer2() {
		return player2;
	}

	/**
	 * @param player2 the player2 to set
	 */
	public void setPlayer2(String player2) {
		this.player2 = player2;
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
	 * @return the gameFull
	 */
	public boolean isFull() {
		return full;
	}

	/**
	 * @param full the gameFull to set
	 */
	public void setFull(boolean full) {
		this.full = full;
	}

	/**
	 * @return the displayColumns
	 */
	public Map[] getDisplayColumns() {
		return displayColumns;
	}

	/**
	 * @param displayColumns the displayColumns to set
	 */
	public void setDisplayColumns(Map[] displayColumns) {
		this.displayColumns = displayColumns;
	}

	/**
	 * @return the columns
	 */
	public String[][] getColumns() {
		return columns;
	}

	/**
	 * @param columns the columns to set
	 */
	public void setColumns(String[][] columns) {
		this.columns = columns;
	}

	/**
	 * @return the chipsDropped
	 */
	public int getChipsDropped() {
		return chipsDropped;
	}

	/**
	 * @param chipsDropped the chipsDropped to set
	 */
	public void setChipsDropped(int chipsDropped) {
		this.chipsDropped = chipsDropped;
	}

	/**
	 * @return the winner
	 */
	public String getWinner() {
		return winner;
	}

	/**
	 * @param winner the winner to set
	 */
	public void setWinner(String winner) {
		this.winner = winner;
	}
	
}
