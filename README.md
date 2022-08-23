
# Java Spring Boot JSON RPC Client side

This project not related to any company, so feel free to make this repo for your base spring boot project.

JSON RPC api server for this Rest API : https://github.com/MatthewBrandon21/jsonrpc-jpa-postgres-server
## Tech Stack

Java Spring Boot 2.7.0 + Spring Web + Lombok


## Run Locally

Clone the project

```bash
  git clone https://github.com/MatthewBrandon21/jsonrpc-jpa-postgres-client.git
```

Go to the project directory

```bash
  cd jsonrpc-jpa-postgres-client
```

Open in your java IDE

Sync Maven for depencency

Run app and automatically migrate the database (http://localhost:8080/)
## API Reference

#### Create User

```
  POST /user/create
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `name`      | `string` | **Required** |
| `username` | `string` | **Required** |
| `email` | `string` | **Required** |
| `password` | `string` | **Required** |
| `isActive` | `int` | **Required**. (0 for false, 1 for true) |

#### Update user

```
  PUT /user/update/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `name`      | `string` | **Required** |
| `username` | `string` | **Required** |
| `email` | `string` | **Required** |
| `password` | `string` | **Required** |
| `isActive` | `int` | **Required**. (0 for false, 1 for true) |

#### Get User

```
  GET /user/findById/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `int` | **Required**. Id of product to update |


## Support

If need help, feel free to contact me! MatthewBrandon21

