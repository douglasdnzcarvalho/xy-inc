'use strict'

/** @type {import('@adonisjs/lucid/src/Schema')} */
const Schema = use('Schema')

class InterestPointsSchema extends Schema {
  up () {
    this.createIfNotExists('interest_points', (table) => {
      table.increments()

      table.string('name').notNullable()
      table.integer('x_coordinate').unsigned()
      table.integer('y_coordinate').unsigned()

      table.timestamps()
    })
  }

  down () {
    this.drop('interest_points')
  }
}

module.exports = InterestPointsSchema
