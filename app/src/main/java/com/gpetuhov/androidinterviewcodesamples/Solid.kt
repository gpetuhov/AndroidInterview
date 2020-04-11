package com.gpetuhov.androidinterviewcodesamples

// Reference:
// https://academy.realm.io/posts/learning-path-solid-principles-for-android/

// RecyclerView adapter has this code in onBindViewHolder method.
// Does it violate any SOLID principles?

/*
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Order order = items.get(position);
        holder.orderNumber.setText(order.getOrderNumber().toString());
        long total = 0;
        for (LineItem item : order.getItems()) {
            total += item.getPrice();
        }
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        String totalValue = formatter.format(cents / 100.0);
        holder.orderTotal.setText(totalValue)
        holder.itemView.setTag(order);
    }
*/

// Answer:
// The code above violates the Single Responsibility Principle.