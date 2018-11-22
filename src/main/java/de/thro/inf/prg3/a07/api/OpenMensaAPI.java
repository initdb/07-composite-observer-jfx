package de.thro.inf.prg3.a07.api;

import de.thro.inf.prg3.a07.model.Meal;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

/**
 * Created by Peter Kurfer on 11/19/17.
 */

public interface OpenMensaAPI
{
	// example request: GET /canteens/229/days/2017-11-22/meals
	@GET("canteens/{id}/days/{date}/meals")
	Call<List<Meal>> getMeals(@Path("id") int id, @Path("date") String date);
}
