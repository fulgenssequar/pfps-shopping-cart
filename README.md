shopping-cart
=============

![CI Status](https://github.com/gvolpe/pfps-shopping-cart/workflows/Build/badge.svg)

### Authentication Data

For didactic purposes this information is made available to the readers but in a real application *THIS SHOULD NEVER BE MADE PUBLIC*.

For Admin users:

- `export SC_JWT_SECRET_KEY="-*5h0pp1ng_k4rt*-"`
- `export SC_JWT_CLAIM="{004b4457-71c3-4439-a1b2-03820263b59c}"`
- `export SC_ADMIN_USER_TOKEN="eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.ezA0YjQ0NTctNzFjMy00NDM5LWExYjItMDM4MjAyNjNiNTl9.mMC4eiPl7huiAO3GdORwKnqJrf96xKPoojQdZtrTbP4"`

For access token (manipulation of the shopping cart):

- `export SC_ACCESS_TOKEN_SECRET_KEY="5h0pp1ng_k4rt"`

For password encryption:

- `export SC_PASSWORD_SALT="06!grsnxXG0d*Pj496p6fuA*o"`

## Requirements

We need to run both `PostgreSQL` and `Redis`. Get started quickly using `docker-compose`:

```
docker-compose up
```

## Tests

To run Unit Tests:

```
sbt test
```

To run Integration Tests:

```
docker-compose up
sbt it:test
docker-compose down
```

## Deploying

Set the proper environment variable (`test` or `prod`):

```
export SC_APP_ENV="test"
```

## HTTP API Resources

If you use the [Insomnia](https://insomnia.rest/) REST Client, you can import the shopping cart resources using the [insomnia.json](insomnia.json) file.
