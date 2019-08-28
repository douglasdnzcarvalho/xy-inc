'use strict'

/*
|--------------------------------------------------------------------------
| InterestPointSeeder
|--------------------------------------------------------------------------
|
| Make use of the Factory instance to seed database with dummy data or
| make use of Lucid models directly.
|
*/

/** @type {import('@adonisjs/lucid/src/Factory')} */
const Factory = use('Factory')

class InterestPointSeeder {
  async run() {
    console.log('Inserindo pontos de interesses iniciais...')

    const dadosIniciais = [
      {
        name: 'Lanchonete',
        x_coordinate: 27,
        y_coordinate: 12
      },
      {
        name: 'Posto',
        x_coordinate: 31,
        y_coordinate: 18
      },
      {
        name: 'Joalheria',
        x_coordinate: 15,
        y_coordinate: 12
      },
      {
        name: 'Floricultura',
        x_coordinate: 19,
        y_coordinate: 21
      },
      {
        name: 'Pub',
        x_coordinate: 12,
        y_coordinate: 8
      },
      {
        name: 'Supermercado',
        x_coordinate: 23,
        y_coordinate: 6
      },
      {
        name: 'Churrascaria',
        x_coordinate: 28,
        y_coordinate: 2
      }
    ]

    for (let i = 0; i < dadosIniciais.length; i++) {
      await Factory.model("App/Models/InterestPoint").create(dadosIniciais[i]);
    }

    console.log('Pontos de Interesse inseridos com sucesso!')
  }
}

module.exports = InterestPointSeeder
