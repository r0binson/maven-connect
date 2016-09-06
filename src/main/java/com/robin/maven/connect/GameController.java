/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robin.maven.connect;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author robin
 */
@Controller
public class GameController {

	private static Map games = new HashMap();
	private static int randomGameIdGenerator = 0;


	@RequestMapping(value = "/", method = RequestMethod.GET,
		headers = "Accept=application/json", produces = "application/json")
	@ResponseBody
	public String welcome() {
		return "Welcome to connect 4 web service!";
	}

	@RequestMapping(value = "/game/update", method = RequestMethod.POST,
		headers = "Accept=application/json", produces = "application/json")
	@ResponseBody
	public Game updateCurrentGame(@RequestBody Game gameData) {
		Game currentGame = (Game)games.get(gameData.getGameId());
		currentGame.setPlayerTurn(gameData.getPlayerTurn());
		currentGame.setGameHasEnded(gameData.isGameHasEnded());
		currentGame.setWinner(gameData.getWinner());
		currentGame.setColumns(gameData.getColumns());
		currentGame.setDisplayColumns(gameData.getDisplayColumns());	
		currentGame.setChipsDropped(gameData.getChipsDropped());
		games.put(gameData.getGameId(), currentGame);
		return currentGame;
	}

	@RequestMapping(value = "/gameUpdate", method = RequestMethod.POST,
		headers = "Accept=application/json", produces = "application/json")
	@ResponseBody
	public Game gameUpdate(@RequestBody Game gameData) {
		System.out.println("gameData:" + gameData);
		Game data = gameData;
		return data;
	}

	@RequestMapping(value = "/gameUpdate/{gameId}",
		method = RequestMethod.GET,
		headers = "Accept=application/json",
		produces = "application/json")
	@ResponseBody
	public Game Update(@PathVariable String gameId) {
		Game game = (Game) games.get(new Integer(gameId));
		return game;
	}

	@RequestMapping(value = "/joinGame", method = RequestMethod.POST,
		headers = "Accept=application/json", produces = "application/json")
	@ResponseBody
	public Boolean joinGame(@RequestBody Join join) {
		Game game = (Game) games.get(join.getGameId());
		if (game.isFull()) {
			return false;
		}
		game.setFull(true);
		game.setPlayer2(join.getName());
		return true;
	}

	@RequestMapping(value = "/game", method = RequestMethod.POST,
		headers = "Accept=application/json", produces = "application/json")
	@ResponseBody
	public Game createGame(@RequestBody String creator) {
		randomGameIdGenerator++;
		Game game = new Game(randomGameIdGenerator, creator);
		games.put(randomGameIdGenerator, game);
		return game;
	}

	@RequestMapping(value = "/games", method = RequestMethod.GET,
		headers = "Accept=application/json", produces = "application/json")
	@ResponseBody
	public List<Game> getAvailableGames() throws IOException {
		return new ArrayList<>(games.values());
	}
}
