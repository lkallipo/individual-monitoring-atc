/**
 * Copyright (c) 2014, 2017, Oracle and/or its affiliates.
 * The Universal Permissive License (UPL), Version 1.0
 */
"use strict";
define(["ojs/ojcore","ojs/ojdatasource-common"],function(a){a.Qn=function(g,c){this.Dq=c?c.childData:null;this.Oga={};a.Qn.O.constructor.call(this,g)};o_("JsonDiagramDataSource",a.Qn,a);a.f.xa(a.Qn,a.pw,"oj.JsonDiagramDataSource");a.Qn.prototype.getData=function(a){if(a){var c=a.nodes;if(void 0===c&&this.Dq)return c=this.Dq(a),this.zka(this.Oga[a.id],c),c;this.B1({nodes:c});return Promise.resolve({nodes:c})}return this.data?(this.B1(this.data),Promise.resolve(this.data)):this.Dq?(c=this.Dq(),this.zka(null,
c),c):Promise.resolve(null)};a.f.j("JsonDiagramDataSource.prototype.getData",{getData:a.Qn.prototype.getData});a.Qn.prototype.B1=function(a){if(this.Dq&&a.nodes){a=a.nodes;for(var c=0;c<a.length;c++)this.Oga[a[c].id]=a[c]}};a.Qn.prototype.zka=function(a,c){if(c instanceof Promise){var b=this;c.then(function(c){Array.isArray(c.nodes)&&(a?a.nodes=c.nodes:b.data.nodes=c.nodes,b.B1(c));Array.isArray(c.links)&&(b.data.links=Array.isArray(b.data.links)?b.data.links.concat(c.links):c.links);b.handleEvent("ADD",
{data:c,parentId:a?a.id:null,index:0})},function(){})}};a.Qn.prototype.getChildCount=function(a){return a?(a=a.nodes,Array.isArray(a)?a.length:void 0===a&&this.Dq?-1:0):-1};a.f.j("JsonDiagramDataSource.prototype.getChildCount",{getChildCount:a.Qn.prototype.getChildCount});a.Qn.prototype.getDescendantsConnectivity=function(){return"unknown"};a.f.j("JsonDiagramDataSource.prototype.getDescendantsConnectivity",{getDescendantsConnectivity:a.Qn.prototype.getDescendantsConnectivity})});