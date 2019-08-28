'use strict'

/*
|--------------------------------------------------------------------------
| Factory
|--------------------------------------------------------------------------
|
| Factories are used to define blueprints for database tables or Lucid
| models. Later you can use these blueprints to seed your database
| with dummy data.
|
*/

/** @type {import('@adonisjs/lucid/src/Factory')} */
const Factory = use('Factory')

Factory.blueprint("App/Models/InterestPoint", async (faker, i, data) => {
    return {
        name: data.name || faker.sentence({ words: 4 }),
        x_coordinate: data.x_coordinate || 0,
        y_coordinate: data.y_coordinate || 0
    };
});